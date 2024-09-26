<h1>Resident Evil API</h1>

<p>This project uses Spring Boot 3.3.2 to provide an API related to Resident Evil.</p>

<h2>Installation</h2>

<ol>
    <li><strong>Clone the repository</strong>:
        <pre><code>git clone &lt;REPOSITORY_URL&gt;
cd &lt;PROJECT_NAME&gt;</code></pre>
    </li>
    <li><strong>Create the Database</strong>: Create a MySQL database named <strong>revil_api</strong>.</li>
    <li><strong>Configure Database Connection</strong>: Update the connection settings in <code>src/main/resources/application.properties</code> if necessary.</li>
    <li><strong>Install Dependencies</strong>: Execute the following command:
        <pre><code>mvn install</code></pre>
    </li>
    <li><strong>Run the API</strong>: Navigate to the project directory and execute:
        <pre><code>mvn spring-boot:run</code></pre>
    </li>
    <li><strong>Access the API</strong>: Once the application is running, you can access the API at <code>http://localhost:8080</code> using tools like Postman or Insomnia.</li>
</ol>

<h2>Usage Examples</h2>
<p>You can add examples of API requests here, such as:</p>
<pre><code>GET http://localhost:8080/endpoint</code></pre>

<h2>Contributions</h2>
<p>If you would like to contribute, please open an issue or submit a pull request.</p>

<h2>Additional Information</h2>
<ul>
    <li>Make sure you have <strong>Maven</strong> and <strong>MySQL</strong> installed and running.</li>
    <li>In <code>src/main/resources/import.sql</code>, there is a query to populate the database, so you don't need to upload information manually.</li>
    <li>If you encounter any issues, check the console output for error messages or missing dependencies.</li>
</ul>
