<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>HQL 执行</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f9f9f9;
            margin: 0;
            padding: 20px;
        }

        h1 {
            color: #333;
        }

        form {
            margin-bottom: 20px;
        }

        textarea {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
            font-size: 14px;
        }

        input[type="text"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
            font-size: 14px;
            margin-top: 10px;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            border: none;
            padding: 10px 15px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 14px;
            margin-top: 10px;
            cursor: pointer;
            border-radius: 4px;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }

        .result {
            color: red;
            font-weight: bold;
            background-color: #fff3f3;
            border: 1px solid #ffcccc;
            padding: 10px;
            border-radius: 4px;
            white-space: pre-wrap; /* 自动换行 */
        }

        .instructions {
            background-color: #e8f4f8;
            border: 1px solid #bcdff1;
            padding: 10px;
            border-radius: 4px;
        }
    </style>
</head>
<body>
<h1>HQL 执行</h1>

<h2>执行语句:</h2>
<form action="execute_hql" method="post">
    <textarea name="hql" rows="4"
              placeholder="在此输入 HQL 语句...">${hql == null ? 'from User where id = 1' : hql}</textarea><br>
    <input type="submit" value="执行">
</form>

<h2>执行的 SQL:</h2>
<pre class="result">${executedSql}</pre>

<h2>执行结果:</h2>
<pre class="result">${result}</pre>

</body>
</html>
