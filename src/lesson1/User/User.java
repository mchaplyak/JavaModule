package lesson1.User;

import java.util.Objects;

public class User {
   private int id;
   private String name;
   private String username;
   private String email;
   private Address address;
   private String website;
   private String phone;

   public User() {
   }

   public User(int id, String name, String username, String email, Address address, String website, String phone) {
      this.id = id;
      this.name = name;
      this.username = username;
      this.email = email;
      this.address = address;
      this.website = website;
      this.phone = phone;
   }

   @Override
   public String toString() {
      return "User{" +
              "id=" + id +
              ", name='" + name + '\'' +
              ", username='" + username + '\'' +
              ", email='" + email + '\'' +
              ", address=" + address +
              ", website='" + website + '\'' +
              ", phone='" + phone + '\'' +
              '}';
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getUsername() {
      return username;
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public Address getAddress() {
      return address;
   }

   public void setAddress(Address address) {
      this.address = address;
   }

   public String getWebsite() {
      return website;
   }

   public void setWebsite(String website) {
      this.website = website;
   }

   public String getPhone() {
      return phone;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      User user = (User) o;
      return id == user.id && Objects.equals(name, user.name) && Objects.equals(username, user.username) && Objects.equals(email, user.email) && Objects.equals(address, user.address) && Objects.equals(website, user.website) && Objects.equals(phone, user.phone);
   }

   @Override
   public int hashCode() {
      return Objects.hash(id, name, username, email, address, website, phone);
   }
}
