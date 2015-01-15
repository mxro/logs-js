package de.mxro.log.js;

import org.timepedia.exporter.client.Export;
import org.timepedia.exporter.client.Exportable;
import org.timepedia.exporter.client.NoExport;

import de.mxro.async.properties.PropertyNode;

@Export
public class JsLogsNode implements Exportable {

    private PropertyNode node;

    @NoExport
    public static final JsLogsNode wrap(final PropertyNode node) {
        final JsLogsNode jsLogsNode = new JsLogsNode();

        jsLogsNode.node = node;

        return jsLogsNode;
    }

    public JsLogsNode() {
        super();

    }

}
