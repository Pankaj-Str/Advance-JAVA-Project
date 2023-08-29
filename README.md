# Build a Multi-Lingual App with JSTL - i18n Tags

Internationalization (i18n) in JavaServer Pages Standard Tag Library (JSTL) involves providing support for creating web applications that can be easily adapted to various languages and regions. JSTL is a library of custom tags for JSP pages that simplifies common tasks, including i18n.

Here's how you can use JSTL to achieve internationalization in your JSP pages:

1. **Resource Bundle Setup:**
   - Create resource bundle properties files for each language you want to support. For example, you might have files like `messages_en.properties` for English and `messages_fr.properties` for French.
   - These properties files contain key-value pairs where keys correspond to messages in your application and values are the translated messages.

2. **Use JSTL `<fmt:setBundle>` Tag:**
   The `<fmt:setBundle>` tag is used to specify the resource bundle you want to use for i18n.
   
   ```jsp
   <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
   <fmt:setBundle basename="path.to.your.resourceBundle" />
   ```

3. **Display Translated Text:**
   The `<fmt:message>` tag is used to display translated messages from the resource bundle.
   
   ```jsp
   <p><fmt:message key="greeting" /></p>
   ```

   In this example, the key "greeting" corresponds to a message in your resource bundle.

4. **Pass Parameters:**
   You can pass dynamic values to your messages using placeholders in your resource bundle messages. The `<fmt:param>` tag helps you achieve this.
   
   ```jsp
   <fmt:message key="welcome.message">
       <fmt:param value="${user}" />
   </fmt:message>
   ```

   In this example, the resource bundle might have a message like "Welcome, {0}!", where the `{0}` is replaced with the value of the `<fmt:param>`.

Remember to include the appropriate JSTL library in your project. You can download the JSTL library and include it in your project's `WEB-INF/lib` directory or use a dependency management system like Maven or Gradle.

It's also essential to set the locale of the application based on user preferences or browser settings. You can achieve this by using Java's `Locale` class and setting it in the session or using a filter to intercept requests and set the appropriate locale.

Here's a basic example of how a JSTL-based i18n setup might look in a JSP page:

```jsp
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="${userPreferredLocale}" />
<fmt:setBundle basename="path.to.your.resourceBundle" />

<p><fmt:message key="greeting" /></p>
<p><fmt:message key="welcome.message">
    <fmt:param value="${user}" />
</fmt:message></p>
```

Please replace `"path.to.your.resourceBundle"` with the actual package path to your resource bundle and adjust the code as needed to integrate it into your application's architecture.
