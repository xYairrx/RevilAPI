<h1>Resident Evil API</h1>
<p>This project uses Spring Boot 3.3.2.</p>

<h2>Following Steps:</h2>
<ol>
    <li><strong>Create the Database</strong>: You need to create a MySQL database named <strong>revil_api</strong>.</li>
    <li><strong>Configure Database Connection</strong>: Make sure to update the database connection settings in <code>src/main/resources/application.properties</code> if is necessary.</li>
    <li><strong>Install Dependencies</strong>: Before running the API, install the required dependencies by executing:
        <pre><code>mvn install</code></pre>
    </li>
    <li><strong>Run the API</strong>: To start the API, navigate to the project directory and execute the following command:
        <pre><code>mvn spring-boot:run</code></pre>
    </li>
    <li><strong>Access the API</strong>: Once the application is running, you can access the API at <code>http://localhost:8080</code> in popular API's applications (like Postman or Insomnia) and
    use the endpoints allowed in the Controller of both Entities</li>
</ol>

<h2>Additional Information:</h2>
<ul>
    <li>Make sure you have <strong>Maven</strong> and <strong>MySQL</strong> installed and running.</li>
    <li>In <code>src/main/resources/import.sql</code> the is a query to give information to the database, so you don't need to upload information manually<li>
    <li>If you encounter any issues, check the console output for error messages or missing dependencies.</li>
</ul>
