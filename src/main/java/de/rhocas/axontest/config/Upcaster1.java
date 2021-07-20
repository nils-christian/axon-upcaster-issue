package de.rhocas.axontest.config;

import org.axonframework.serialization.upcasting.event.IntermediateEventRepresentation;
import org.axonframework.serialization.upcasting.event.SingleEventUpcaster;

public class Upcaster1 extends SingleEventUpcaster {

	@Override
	protected boolean canUpcast( final IntermediateEventRepresentation intermediateRepresentation ) {
		return true;
	}

	@Override
	protected IntermediateEventRepresentation doUpcast( final IntermediateEventRepresentation intermediateRepresentation ) {
		System.out.println( "Upcaster 1 executed" );
		return intermediateRepresentation;
	}

	@Override
	public String toString( ) {
		return "Upcaster 1";
	}

}
