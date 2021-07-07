package com.customersystem.customerarchiving.models;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
public class SystemUser {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@NotBlank(message="Personel Numara Alanı Boş olamaz!")
	@Column(name="staff_no")
	private int staffNo;
	
	@NotBlank(message="İsim Alanı Boş olamaz!")
	@Column(name="name")
	private String userName;
	
	@NotBlank(message="Soyisim Alanı Boş olamaz!")
	@Column(name="surname")
	private String userSurname;
	
	@NotBlank(message="Doğum Tarihi Alanı Boş olamaz!")
	@Column(name="date_of_birth")
	private Date dateOfBirth;
	
	@NotBlank(message="Tc No Alanı Boş olamaz!")
	@Column(name="identity_number")
	private int identityNumber;
	
	@Email(message = "Lütfen Geçerli Bir Mail Adresi Giriniz!")
	@NotBlank(message="Mail Alanı Boş olamaz!")
	@Column(name="mail")
	private String email;
	
	@NotBlank(message="Şifre Alanı Boş olamaz!")
	@Size(min=6, max=50, message="Şifre en az 6, en fazla 50 karakterden oluşabilir.")
	@Column(name="password")
	private String password;
	

	

}
