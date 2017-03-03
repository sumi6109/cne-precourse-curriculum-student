package com.galvanize;

import java.util.List;

/**
 * Created by sushantmittal on 3/3/17.
 */
public interface Addressable {
    public List<Address> getAddresses();
    public void addAddress(Address address);
}
