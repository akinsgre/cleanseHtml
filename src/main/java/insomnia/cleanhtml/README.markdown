Example of cleansing HTML using AntiSAMY
========================================

This is a small example program that uses AntiSAMY policy files to cleanse input of unwanted HTML.

ie., "<p>Hello World</p><script>alert("Test")</script>" becomes "<p>Hello World</p>"

This is useful for allowing formatted text but avoiding XSS vulnerabilities.

https://www.owasp.org/index.php/XSS_(Cross_Site_Scripting)_Prevention_Cheat_Sheet#RULE_.236_-_Use_an_HTML_Policy_engine_to_validate_or_clean_user-driven_HTML_in_an_outbound_way