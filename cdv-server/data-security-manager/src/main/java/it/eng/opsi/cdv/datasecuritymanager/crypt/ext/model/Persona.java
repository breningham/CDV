package it.eng.opsi.cdv.datasecuritymanager.crypt.ext.model;

import it.eng.opsi.cdv.datasecuritymanager.crypt.annotation.Encryption;
import it.eng.opsi.cdv.datasecuritymanager.crypt.annotation.Encryption.EncryptionLevel;

public class Persona {
	
	@Encryption(level = EncryptionLevel.SKIP)
	private long id;
	
	@Encryption(level = EncryptionLevel.APP)
	private String firstname;
	
	@Encryption(level = EncryptionLevel.SKIP)
	private String lastname;
	
	@Encryption(level = EncryptionLevel.USER)
	private String codicefiscale;
	
	@Encryption(level = EncryptionLevel.APP)
	private String birthdate;
	
	@Encryption(level = EncryptionLevel.USER)
	private String zipcode;
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * @return the birthdate
	 */
	public String getBirthdate() {
		return birthdate;
	}
	/**
	 * @param birthdate the birthdate to set
	 */
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	/**
	 * @return the codicefiscale
	 */
	public String getCodicefiscale() {
		return codicefiscale;
	}
	/**
	 * @param codicefiscale the codicefiscale to set
	 */
	public void setCodicefiscale(String codicefiscale) {
		this.codicefiscale = codicefiscale;
	}
	/**
	 * @return the zipcode
	 */
	public String getZipcode() {
		return zipcode;
	}
	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Persona [id=" + id + ", firstname=" + firstname + ", lastname="
				+ lastname + ", codicefiscale=" + codicefiscale
				+ ", birthdate=" + birthdate + ", zipcode=" + zipcode + "]";
	}
	
	

}
