package com.myPackage;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

// Connection class
public final class Connection
{
    // Constructor.
    private Connection()
    {

    }

    // Connect.
    public static boolean connect(String urlString)
    {
        try
        {
            // Initialize connection.
            URL url = new URL(urlString);
            URLConnection connection = url.openConnection();

            // Connect.
            connection.connect();

            // Return access.
            return true;
        }
        catch (MalformedURLException exs)
        {
            return false;
        }
        catch (IOException exs)
        {
            return false;
        }
    }


}
