package com.capspringboot.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
	public class Categories {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		Integer categoryId;
		String categoryTitle;
		String categoryDescription;
		String categoryImageUrl;
		Integer active;
		Date addedOn;
		
		public Categories() {
			
		}
		
		public Categories(Integer categoryId, String categoryTitle, String categoryDescription, String categoryImageUrl,
				Integer active, Date addedOn) {
			this.categoryId = categoryId;
			this.categoryTitle = categoryTitle;
			this.categoryDescription = categoryDescription;
			this.categoryImageUrl = categoryImageUrl;
			this.active = active;
			this.addedOn = addedOn;
		}
		

		public Integer getCategoryId() {
			return categoryId;
		}

		public void setCategoryId(Integer categoryId) {
			this.categoryId = categoryId;
		}

		public String getCategoryTitle() {
			return categoryTitle;
		}

		public void setCategoryName(String categoryTitle) {
			this.categoryTitle = categoryTitle;
		}

		public String getCategoryDescription() {
			return categoryDescription;
		}

		public void setCategoryDescription(String categoryDescription) {
			this.categoryDescription = categoryDescription;
		}

		public String getCategoryImageUrl() {
			return categoryImageUrl;
		}

		public void setCategoryImageUrl(String categoryImageUrl) {
			this.categoryImageUrl = categoryImageUrl;
		}

		public Integer getActive() {
			return active;
		}

		public void setActive(Integer active) {
			this.active = active;
		}

		public Date getAddedOn() {
			return addedOn;
		}

		public void setAddedOn(Date addedOn) {
			this.addedOn = addedOn;
		}

		@Override
		public String toString() {
			return "Categories [categoryId=" + categoryId + ", categoryTitle=" + categoryTitle + ", categoryDescription="
					+ categoryDescription + ", categoryImageUrl=" + categoryImageUrl + ", active=" + active + ", addedOn="
					+ addedOn + "]";
		}
		
	}

