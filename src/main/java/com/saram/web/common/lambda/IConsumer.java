package com.saram.web.common.lambda;

/**
 * IConsumer
 */
@FunctionalInterface
public interface IConsumer {

    public abstract void accept(Object o);
}