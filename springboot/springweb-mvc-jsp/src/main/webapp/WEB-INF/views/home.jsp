<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Home</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
    <div class="container">
        <h1>Welcome</h1>
        <form action="/greet" method="get">
            <input type="text" name="name" placeholder="Enter your name" required>
            <button type="submit">Greet</button>
        </form>
    </div>
</body>
</html>
