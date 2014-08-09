package com.ofg.github.topics.analyzer

import com.ofg.infrastructure.Stub
import groovy.transform.TypeChecked

import static com.github.tomakehurst.wiremock.client.WireMock.*
import static com.ofg.infrastructure.GithubAnalyzerMediaType.CONTENT_TYPE
import static com.ofg.infrastructure.GithubAnalyzerMediaType.V1_JSON

@TypeChecked
class PairIdControllerStubs {

    @Stub
    public static void collectPairId() {
        stubFor(
                post(urlMatching('/api/analyze'))
                        .withHeader(CONTENT_TYPE, equalTo(V1_JSON))
                        .willReturn(aResponse()
                        .withStatus(200)
                ))

    }

}
