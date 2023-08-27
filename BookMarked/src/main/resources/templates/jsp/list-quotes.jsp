<!DOCTYPE html>
<html>
<head>
    <!-- Gerekli stil ve script bağlantıları -->
</head>
<body>
    <table>
        <tr th:each="quote : ${quotes}">
            <td th:text="${quote.content}"></td>
            <td><a th:href="@{/delete/{id}(id=${quote.id})}">Delete</a></td>
        </tr>
    </table>
    <form th:action="@{/add}" method="post">
        <input type="text" name="content">
        <button type="submit">Add</button>
    </form>
</body>
</html>
