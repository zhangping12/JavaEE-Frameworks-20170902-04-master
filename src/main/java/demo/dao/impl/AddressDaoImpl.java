package demo.dao.impl;

import demo.dao.AddressDao;
import demo.model.Address;
import org.springframework.stereotype.Repository;

@Repository
public class AddressDaoImpl extends GenericDaoImpl<Address, Integer> implements AddressDao {
}
