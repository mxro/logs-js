package de.mxro.log.js;

import org.timepedia.exporter.client.Export;
import org.timepedia.exporter.client.Exportable;
import org.timepedia.exporter.client.NoExport;

import de.mxro.async.log.LogsCommon;
import de.mxro.async.properties.PropertyNode;

@Export
public class JsLogsNode implements Exportable {

    @NoExport
    private PropertyNode node;

    @Export
    public String string(final String id, final String message) {
        return this.node.record(LogsCommon.string(id, message)).get();
    }

    @Export
    public String render() {
        return this.node.render().get();
    }

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
