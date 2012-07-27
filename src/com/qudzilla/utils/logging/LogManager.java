/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qudzilla.utils.logging;

import java.util.logging.Logger;

/**
 *
 * @author kaz
 */
public class LogManager {
    public void error(String msg) {
        Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).severe(convertMessage("E", msg));
    }
    
    public void warn(String msg) {
        Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).warning(convertMessage("W", msg));
    }
    
    public void info(String msg) {
        Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).info(convertMessage("I", msg));
    }
    
    public void config(String msg) {
        Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).config(convertMessage("C", msg));
    }
    
    public void debug(String msg) {
        Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).fine(convertMessage("D", msg));
    }
    
    public void trace(String msg) {
        Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).finer(convertMessage("T", msg));
    }

    private String convertMessage(String msg) {
        StringBuilder sb = new StringBuilder(this.getClass().getSimpleName());
        sb.append(" [");
        sb.append(level);
        sb.append("] ");
        sb.append(msg);
        return sb.toString();
    }
}
