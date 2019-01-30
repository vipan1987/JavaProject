general syntax xpath : //tagname[@attribute='value']

Relative xpath : //div[@class='productActions productActions3']//input[@type='hidden'][@name='productId']

xpath functions: text(), contians(), starts-wtith(), ends-with(), position(), last(),
                 substring("String", startIndex, endIndex) --> API Testing
                 
                 
//span[text()='Login']/ancestor::div[@id='header_content']
//span[text()='Login']/../..                 