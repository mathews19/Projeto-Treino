package com.blog2.blog2.exemplo;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SoUmExemplo {
	@Id
	@GeneratedValue
	private long id;
	
	@NotNull
	@Size(min = 5,  max = 100)
	private String titulo;
	
	@NotNull
	@Size(min = 5,  max = 500)
	private String texto;
}
