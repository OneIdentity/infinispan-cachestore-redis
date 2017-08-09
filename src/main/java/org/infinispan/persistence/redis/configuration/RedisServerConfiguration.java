package org.infinispan.persistence.redis.configuration;

final public class RedisServerConfiguration
{
    private final String host;
    private final int port;
    private final boolean ssl;

    RedisServerConfiguration(String host, int port) {
        this(host, port, false);
    }

    RedisServerConfiguration(String host, int port, boolean ssl) {
        this.host = host;
        this.port = port;
        this.ssl = ssl;
    }

    public String host()
    {
        return this.host;
    }

    public int port()
    {
        return this.port;
    }

    public boolean isSsl() {
        return this.ssl;
    }
}
