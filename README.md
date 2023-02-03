# CORS_Workaround
Getting around CORS by using localhost instead of axios

Working on the React / Spring Boot tuturial here https://youtu.be/5PdEmeopJVQ I ran into the problem that when trying to connect the client to my backend server. The console was saying that this was a CORS error (accessing a different server for an http request).

Checking the console errors, it seemed that the URL provided as the BaseURL in the tutorial was not accepting requests and I think this is something to do with ngrok. Need to do some more investigation.

Anyway in the meantime I changed this axios config to point at my local host (axios.config,.js) and updated my MovieController to accept Cross Origin requests (MovieController.js) and then restarting both parts returned the array of films.

Facepalm checks:
- make sure both the backend and front end are running
- refresh your browser after applying front end changes.
