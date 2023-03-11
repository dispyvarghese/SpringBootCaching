# SpringBootCaching

for enabling inbuild caching, we have to add dependency ,then use annotation @EnableCashing, @Cacheable(value="product", key="#id")

default caching will not detect changes done in DB manually, so we use third party caching like Redis(centralised caching), ehcache.

for ehcache, along with previous changes, we have to add ehache.xml,the dependencies, make model setializable, 
