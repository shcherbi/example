package json.jackson.entity;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PeopleEntity {
    private String id;
    private long index;
    private String guid;
    private boolean isActive;
    private String balance;
    private int age;
    private String eyeColor;
    private NameEntity name;
    private String company;
    private String email;
    private String phone;
    private String address;
    private String about;
    private String registered;
    @JsonIgnore
    private String latitude;
    @JsonIgnore
    private String longitude;
    private List<String> tags;
    @JsonIgnore
    private List<Integer> range;
    private List<FriendEntity> friends;
    @JsonIgnore
    private String greeting;
    @JsonIgnore
    private String favoriteFruit;

    //Use JsonCreator annotation if wanna to use another
    //constructor because Jackson use default one
    /*
   @JsonCreator
   public PeopleEntity(@JsonProperty("id") int id, @JsonProperty("index") int index) {
   ...
   }
     */

    public String getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
    }

    public long getIndex() {
        return index;
    }

    @JsonProperty("index")
    public void setIndex(long index) {
        this.index = index;
    }

    public String getGuid() {
        return guid;
    }

    @JsonProperty("guid")
    public void setGuid(String guid) {
        this.guid = guid;
    }

    public boolean isActive() {
        return isActive;
    }

    @JsonProperty("isActive")
    public void setActive(boolean active) {
        isActive = active;
    }

    public String getBalance() {
        return balance;
    }

    @JsonProperty("balance")
    public void setBalance(String balance) {
        this.balance = balance;
    }

    public int getAge() {
        return age;
    }

    @JsonProperty("age")
    public void setAge(int age) {
        this.age = age;
    }

    @JsonProperty("eyeColor")
    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    @JsonProperty("name")
    public NameEntity getName() {
        return name;
    }

    public void setName(NameEntity name) {
        this.name = name;
    }

    @JsonProperty("company")
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("about")
    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @JsonProperty("registered")
    public String getRegistered() {
        return registered;
    }

    public void setRegistered(String registered) {
        this.registered = registered;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<Integer> getRange() {
        return range;
    }

    public void setRange(List<Integer> range) {
        this.range = range;
    }

    @JsonProperty("friends")
    public List<FriendEntity> getFriends() {
        return friends;
    }

    public void setFriends(List<FriendEntity> friends) {
        this.friends = friends;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getFavoriteFruit() {
        return favoriteFruit;
    }

    public void setFavoriteFruit(String favoriteFruit) {
        this.favoriteFruit = favoriteFruit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PeopleEntity that = (PeopleEntity) o;
        return index == that.index &&
                isActive == that.isActive &&
                age == that.age &&
                Objects.equals(id, that.id) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(balance, that.balance) &&
                Objects.equals(eyeColor, that.eyeColor) &&
                Objects.equals(name, that.name) &&
                Objects.equals(company, that.company) &&
                Objects.equals(email, that.email) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(address, that.address) &&
                Objects.equals(about, that.about) &&
                Objects.equals(registered, that.registered) &&
                Objects.equals(latitude, that.latitude) &&
                Objects.equals(longitude, that.longitude) &&
                Objects.equals(tags, that.tags) &&
                Objects.equals(range, that.range) &&
                Objects.equals(friends, that.friends) &&
                Objects.equals(greeting, that.greeting) &&
                Objects.equals(favoriteFruit, that.favoriteFruit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, index, guid, isActive, balance, age, eyeColor, name, company, email, phone, address, about, registered, latitude, longitude, tags, range, friends, greeting, favoriteFruit);
    }
}
