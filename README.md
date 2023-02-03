# CORS_Workaround
Getting around CORS by using localhost instead of axios

Working on the React / Spring Boot tuturial here https://youtu.be/5PdEmeopJVQ I ran into the problem that when trying to connect the client to my backend server. The console was saying that this was a CORS error (accessing a different server for an http request).

Checking the console errors, it seems that the URL provided as the BaseURL in the tutorial was not accepting requests. 

