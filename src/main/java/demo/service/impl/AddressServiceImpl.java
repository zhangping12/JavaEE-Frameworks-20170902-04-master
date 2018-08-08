package demo.service.impl;

import demo.dao.GenericDao;
import demo.model.Address;
import demo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl extends GenericServiceImpl<Address, Integer> implements AddressService {
    @Override
    @Autowired
    @Qualifier("addressDaoImpl")
    public void setGenericDao(GenericDao<Address, Integer> genericDao) {
        super.genericDao = genericDao;
    }
}
