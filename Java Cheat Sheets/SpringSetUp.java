New Spring Starter Project

name
first-jsp-demo

com.johncuevas.firstjspdemo

spring web & boot devtools

mysql & jpa

// 1. Dependencies (pom.xml)

Add Dependencies

<!-- ... -->
        <dependency>
                <groupId>org.apache.tomcat.embed</groupId>
                <artifactId>tomcat-embed-jasper</artifactId>
        </dependency>
        <dependency>
                <groupId>javax.servlet</groupId>
                <artifactId>jstl</artifactId>
        </dependency>
<!-- ... -->

Bootstrap Dependencies

//     <!-- webjars locator dependency enables auto-detection of the version, so your .jsp 
//         file links are version-agnostic in case you update the versions here in your pom later -->
//     <dependency>
//         <groupId>org.webjars</groupId>
//         <artifactId>webjars-locator</artifactId>
//         <version>0.30</version>
//     </dependency>
//     
//     <!-- BOOTSTRAP DEPENDENCIES -->
//     <dependency>
//         <groupId>org.webjars</groupId>
//         <artifactId>bootstrap</artifactId>
//         <version>5.0.1</version>
//     </dependency>
//     <dependency>
//         <groupId>org.webjars</groupId>
//         <artifactId>jquery</artifactId>
//         <version>3.6.0</version>
//     </dependency>

JPA Dependencies for mySQL
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <scope>runtime</scope>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>


Spring boot starter validation
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-validation</artifactId>
    </dependency>   



// 2. application.properties

src/main/resources/applications.properties

spring.mvc.view.prefix=/WEB-INF/

mySQL setup

spring.datasource.url=jdbc:mysql://localhost:3306/<<YOUR_SCHEMA>>
spring.datasource.username=<<dbuser>>
spring.datasource.password=<<dbpassword>>
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update

update
spring.mvc.hiddenmethod.filter.enabled=true

// 3. Create WEB-INF for jsp files

WEB-INF/home.jsp
src/main/webapp

Top of JSP files

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

Hidden for edit (under form)
<input type="hidden" name="_method" value="put">

// 4. Create controllers package

// HomeController.java

1. annotation

@RestController - for api

@Controller - for jsp files

@GetMapping ("/")
public String home()
        return "home.jsp";

// 5. Home Controller class

<form:form class="form" action="/processForm" method="post" modelAttribute = "expense">
			<div class = "form-group mb-2">
				<form:label path = "expense">Expense Name:</form:label>
				<form:errors path = "expense"/>
				<form:input type="text"
					path="expense" class = "form-control" />
			</div>
			<div class = "form-group mb-2">
				<form:label path = "vendor">Vendor:</form:label>
				<form:errors path = "vendor"/>
				<form:input type="text"
					path="vendor" class = "form-control" />
			</div>
			<div class = "form-group mb-2">
				<form:label path = "amount">Amount:</form:label>
				<form:errors path = "amount"/>
				<form:input type="number"
					path="amount" class = "form-control" />
			</div>
			<div class = "form-group mb-2">
				<form:label path = "description">Description:</form:label>
				<form:errors path = "description"/>
				<form:textarea class = "form-control" path = "description"></form:textarea>
			</div>

			<button class = "btn btn-primary">Send</button>
		</form:form>

