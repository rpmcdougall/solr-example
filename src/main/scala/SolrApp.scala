import org.apache.solr.client.solrj.SolrQuery
import org.apache.solr.client.solrj.impl.HttpSolrClient
import org.apache.solr.client.solrj.response.QueryResponse
import org.apache.solr.common.SolrDocumentList

// Using solr scala client
object SolrApp extends App {

  import com.github.takezoe.solr.scala._

  val client = new SolrClient("http://localhost:8983/solr/tweets")

  val result = client.query("screen_name: %thelabdude%")
    .fields("id", "timestamp", "text")
    .sortBy("id", Order.asc)
    .getResultAsMap()

  result.documents.foreach { doc: Map[String, Any] =>
    println(doc)
  }

}


//Using solrj
object SolrAppSolr extends App {

  val client = new HttpSolrClient.Builder("http://localhost:8983/solr/tweets").build()

  val query: SolrQuery = new SolrQuery()
  query.setQuery("screen_name: %thelabdude%")
  val queryResponse: QueryResponse = client.query(query)
  val docList: SolrDocumentList = queryResponse.getResults

  docList.forEach { tweet =>
    println(tweet.getFieldValueMap)
  }
}