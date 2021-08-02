package org.ajay.networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkingDemo {
    public static void main(String[] args) {
        String url = "ajay-tidke.netlify.app";

        try {
            InetAddress inetAddress = InetAddress.getByName(url);

            System.out.println("Address : " + inetAddress.getAddress());

            System.out.println("Host Address : " + inetAddress.getHostAddress());

            System.out.println("isAnyLocalAddress : " + inetAddress.isAnyLocalAddress());

            System.out.println("isLinkLocalAddress : " + inetAddress.isLinkLocalAddress());

            System.out.println("isLoopbackAddress : " + inetAddress.isLoopbackAddress());

            System.out.println("isSiteLocalAddress : " + inetAddress.isSiteLocalAddress());

            System.out.println("isLoopbackAddress : " + inetAddress.isLoopbackAddress());

            System.out.println("isSiteLocalAddress : " + inetAddress.isSiteLocalAddress());

            System.out.println("hashCode : " + inetAddress.hashCode());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}
