package com.fruit.usermanagement.test.factory.impl;

import com.fruit.usermanagement.backend.bean.Facility;
import com.fruit.usermanagement.test.factory.AbstractObjectFactory;

public class FacilityObjectFactory extends AbstractObjectFactory<Facility>{
	
	@Override
	protected void setupNonPersistedList() throws Exception {
		
		if( nonPersistedObjectList.size() == 0 ) {

			nonPersistedObjectList.add( new Facility( "Bowling Green", "Compell road" ) );
			nonPersistedObjectList.add( new Facility( "Gainesville", "SouthWest" ) );
			nonPersistedObjectList.add( new Facility( "San Jose", "LivingHope" ) );

		}
		
	}

	@Override
	protected boolean compare( Facility obj1, Facility obj2 ) {
		// TODO Auto-generated method stub
		return obj1.getId() == obj2.getId();
	}
	
}
