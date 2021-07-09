package com.customersystem.customerarchiving.models;
import java.time.LocalDate;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","file"})
@Table(name="customers")

public class Customer {
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;

		@NotBlank(message="Personel Numara Alanı Boş olamaz!")
		@Column(name="customer_no")
		private int customerNo;
		
		@NotBlank(message="İsim Alanı Boş olamaz!")
		@Column(name="name")
		private String customerName;
		
		@NotBlank(message="Soyisim Alanı Boş olamaz!")
		@Column(name="surname")
		private String customerSurname;
		
		@NotBlank(message="Doğum Tarihi Alanı Boş olamaz!")
		@Column(name="date_of_birth")
		private LocalDate dateOfBirth;
		
		@NotBlank(message="Tc No Alanı Boş olamaz!")
		@Column(name="identity_number")
		private String identityNumber;
		
		@Email(message = "Lütfen Geçerli Bir Mail Adresi Giriniz!")
		@NotBlank(message="Mail Alanı Boş olamaz!")
		@Column(name="email")
		private String email;
		
		@NotBlank(message="Adres Alanı Boş olamaz!")
		@Column(name="adress")
		private String address;
		
		@OneToMany(mappedBy = "customers")
		private List<File> file;
		

}
