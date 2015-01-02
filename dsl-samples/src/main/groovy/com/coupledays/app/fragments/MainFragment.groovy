package com.coupledays.app.fragments

import com.coupledays.entity.Apartment
import groovy.transform.CompileStatic

@CompileStatic
class MainFragment extends DefaultFragment {
    @Override
    List<Apartment> getApartmentList(int offset) {
        (List<Apartment>) Apartment.apartmentList(offset: offset * 30)
    }
}
