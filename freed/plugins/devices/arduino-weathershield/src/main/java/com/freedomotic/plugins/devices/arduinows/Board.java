/**
 *
 * Copyright (c) 2009-2016 Freedomotic team http://freedomotic.com
 *
 * This file is part of Freedomotic
 *
 * This Program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2, or (at your option) any later version.
 *
 * This Program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * Freedomotic; see the file COPYING. If not, see
 * <http://www.gnu.org/licenses/>.
 */
package com.freedomotic.plugins.devices.arduinows;

/**
 *
 * @author Mauro Cicolella
 */
public class Board {

    private String ipAddress = null;
    private int port;

    /**
     *
     * @param ipAddress
     * @param port
     */
    public Board(String ipAddress, int port) {
        setIpAddress(ipAddress);
        setPort(port);
    }

    /**
     *
     * @return
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     *
     * @param ipAddress
     */
    public final void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     *
     * @return
     */
    public int getPort() {
        return port;
    }

    /**
     *
     * @param port
     */
    public final void setPort(int port) {
        this.port = port;
    }
}
