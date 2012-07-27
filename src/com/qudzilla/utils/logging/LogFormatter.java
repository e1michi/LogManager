/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qudzilla.utils.logging;

import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/**
 *
 * @author kaz
 */
public class LogFormatter extends Formatter {

    @Override
    public String format(LogRecord lr) {
        StringBuffer sb = new StringBuffer();

        long millis = lr.getMillis();
        String time = String.format("%tDT%<tT", millis);
        sb.append(time);

        sb.append(" <");
        Level level = lr.getLevel();
        if (level.equals(Level.SEVERE)) {
            sb.append("E");
        }
        else if (level.equals(Level.WARNING)) {
            sb.append("W");
        }
        else if (level.equals(Level.INFO)) {
            sb.append("I");
        }
        else if (level.equals(Level.CONFIG)) {
            sb.append("C");
        }
        else if (level.equals(Level.FINE)) {
            sb.append("D");
        }
        else if (level.equals(Level.FINER)) {
            sb.append("T");
        }
        sb.append(">");

        sb.append("[");
        sb.append(lr.getSourceClassName());
        sb.append("]");
        
        sb.append(" ");
        sb.append(formatMessage(lr));

        return sb.toString();
    }
}
