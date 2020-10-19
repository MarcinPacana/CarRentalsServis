package service;

import encje.Address;

import java.util.List;

public interface AddressDaoInt {

    void save(Address address);
    void update(Address address);
    void delete(Address address);
    Address findByAddressId(Long id);
    List<Address> findByAddressCity (String city);
    List<Address> findByAddressZipcode (int zipCode);
    List<Address> findByAddressStreet (String street);

}
