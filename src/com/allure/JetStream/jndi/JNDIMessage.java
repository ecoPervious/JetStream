/*
 * This file is part of JetStreamQ.
 *    
 * Copyright 2010-2013 Allure Technology, Inc. All Rights Reserved.
 * www.alluretechnology.com
 *
 * JetStreamQ is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 2 of the License.
 *
 * JetStreamQ is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with JetStreamQ. If not, see <http://www.gnu.org/licenses/>.
 */
package com.allure.JetStream.jndi;

import java.io.*;

public class JNDIMessage implements Serializable {

    private static final long serialVersionUID = 1L;
    public final static int RESPONSE_MSG = 1;
    public final static int LOOKUP_MSG = 2;
    public final static int BIND_MSG = 3;
    public final static int REBIND_MSG = 4;
    public final static int UNBIND_MSG = 5;
    public int type = -1;
    public String text = "";
    public Serializable object = null;
}
