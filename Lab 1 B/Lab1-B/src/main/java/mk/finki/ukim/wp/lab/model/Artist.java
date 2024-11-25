package mk.finki.ukim.wp.lab.model;

import lombok.Data;

@Data
public class Artist
{

    Long id;
    String firstName;
    String lastName;
    String bio;

    public Artist(String firstName, String lastName, String bio)
    {
        this.id = (long) (Math.random()*1000);
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;
    }

    public Long getId()
    {

        return id;
    }

    public String getFirstName()
    {

        return firstName;
    }

    public String getLastName()
    {

        return lastName;
    }

    public String getBio()
    {

        return bio;
    }

    public void setId(Long id)
    {

        this.id = id;
    }

    public void setFirstName(String firstName)
    {

        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {

        this.lastName = lastName;
    }

    public void setBio(String bio)
    {

        this.bio = bio;
    }
}
