package com.dianping.pigeon.remoting.invoker.route.region;

import com.dianping.pigeon.remoting.invoker.Client;
import com.dianping.pigeon.remoting.invoker.config.InvokerConfig;

import java.util.List;

/**
 * Created by chenchongze on 16/4/15.
 */
public class WeightBasedRegionPolicy implements RegionPolicy {
    @Override
    public List<Client> getPreferRegionClients(List<Client> clientList, InvokerConfig<?> invokerConfig) {
        return null;
    }
}
