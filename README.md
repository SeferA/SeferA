# Hello!

- Hi, I'm high school student
- I'm desktop application and back-end developer
- I've nearly about 4 years programming experience
- I'm currently improving the my Web Development skills

```js
if (readme.click == true){
  var introduce = new AboutMySelf(
  "Sefer", "Turkey", 
  ["Java, "JavaScript", "PHP"], 
  "i have some ideas for github orgs to soon", 
  null);

  introduce.introduceMySelf();
}

class AboutMySelf {
   constructor(name, location, skills, orgs, work-for){
    this.name = name;
    this.location = location;
    this.skills = skills;
    this.orgs = orgs;
    this.work-for = work-for;
  }

  function getName(){
     return this.name;
  }

  function getLocation(){
     return this.location;
  }

  function getSkills(){
     return this.skills;
  }

  function getOrganizations(){
     return this.orgs;
  }
  
  function getWorkFor(){
     return this.work-for;
  }

  function introduceMySelf(){
     document.writeln(getName() + "<br>" + getLocation() + "<br>" + getSkills() + "<br>" + getOrganizations() + "<br>" + getWorkFor());
  }
}
```

<!---
SeferA/SeferA is a ✨ special ✨ repository because its `README.md` (this file) appears on your GitHub profile.
You can click the Preview link to take a look at your changes.
--->
