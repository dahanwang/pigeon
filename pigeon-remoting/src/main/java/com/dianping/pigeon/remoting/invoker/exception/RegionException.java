package com.dianping.pigeon.remoting.invoker.exception;

/**
 * Created by chenchongze on 16/3/10.
 */
public class RegionException extends RuntimeException {

    public RegionException(String msg) {
        super(msg);
    }

    public RegionException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public RegionException(Throwable cause) {
        super(cause);
    }
}
