Blog REST API

This is a simple REST API for managing a blog. It provides endpoints to create, read, update, and delete blog posts.

The application will start at http://localhost:8080/api.

Endpoints
Get All Posts

    URL: http://localhost:8080/api/posts
    Method: GET
    Description: Retrieves all blog posts.

Get Post by ID

    URL: http://localhost:8080/api/posts/{postId}
    Method: GET
    Description: Retrieves a single blog post by its ID.

Create Post

    URL: http://localhost:8080/api/posts
    Method: POST
    Description: Creates a new blog post.
    Request Body: JSON object with the following fields:
        title: Title of the post
        content: Content of the post
        author: Author of the post

Update Post

    URL: http://localhost:8080/api/posts/{postId}
    Method: PUT
    Description: Updates an existing blog post.
    Request Body: JSON object with the following fields:
        title: New title of the post
        content: New content of the post
        author: New author of the post

Delete Post

    URL: http://localhost:8080/api/posts/{postId}
    Method: DELETE
    Description: Deletes a blog post by its ID.

Search Posts by Author

    URL: http://localhost:8080/api/posts/search/findByAuthor
    Method: GET
    Description: Retrieves blog posts by the specified author.
    Query Parameters:
        author: Author's name

Smart Search Posts by Author

    URL: http://localhost:8080/api/posts/search/smart-search
    Method: GET
    Description: Performs a smart search for blog posts by author.
    Query Parameters:
        author: Author's name (supports regex)

