package com.aistar.util;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import sun.misc.Contended;

@Contended
@Aspect
public class LogUtil {
    @After("execution(* com.aistar.service.ProductService.add*(..))" +
            "||execution(* com.aistar.service.ProductService.update*(..))" +
            "||execution(* com.aistar.service.ProductService.delete*(..))")
    public void addLog(){
        System.out.println("LogUtil ......");
    }

}
