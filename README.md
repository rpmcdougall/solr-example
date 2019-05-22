# solr-example

Quick Solr Examples to show basic query using provided tweets data from a tutorial against a local docker instance.

Setting up tweets core
```
docker exec -it solr_solr_1 solr create -c tweets
```

Then add data through ui or post utility from solr.
