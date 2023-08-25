.class public Lcom/daaw/hz1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/oe1;


# instance fields
.field public transient a:Lcom/daaw/pe1;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/ox;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lcom/daaw/tf0;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/hz1;->a:Lcom/daaw/pe1;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/hz1;->b:Ljava/util/List;

    new-instance v0, Lcom/daaw/tf0;

    invoke-direct {v0}, Lcom/daaw/tf0;-><init>()V

    iput-object v0, p0, Lcom/daaw/hz1;->c:Lcom/daaw/tf0;

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/pe1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/hz1;->a:Lcom/daaw/pe1;

    return-object v0
.end method

.method public b(Ljava/io/OutputStream;Ljava/lang/String;)V
    .locals 8

    invoke-static {}, Ljavax/xml/parsers/DocumentBuilderFactory;->newInstance()Ljavax/xml/parsers/DocumentBuilderFactory;

    move-result-object v0

    invoke-virtual {v0}, Ljavax/xml/parsers/DocumentBuilderFactory;->newDocumentBuilder()Ljavax/xml/parsers/DocumentBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljavax/xml/parsers/DocumentBuilder;->newDocument()Lorg/w3c/dom/Document;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lorg/w3c/dom/Document;->setStrictErrorChecking(Z)V

    const-string v2, "xml"

    invoke-interface {v0, v2}, Lorg/w3c/dom/Document;->createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;

    move-result-object v2

    invoke-interface {v0, v2}, Lorg/w3c/dom/Document;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    iget-object v3, p0, Lcom/daaw/hz1;->b:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/ox;

    invoke-virtual {v4}, Lcom/daaw/ox;->a()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v5}, Lorg/w3c/dom/Document;->createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;

    move-result-object v5

    invoke-virtual {v4}, Lcom/daaw/ox;->a()Ljava/lang/String;

    move-result-object v6

    const-string v7, "filename"

    invoke-interface {v5, v7, v6}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v5}, Lorg/w3c/dom/Element;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    invoke-virtual {v4}, Lcom/daaw/ox;->b()Lcom/daaw/mj1;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const-string v1, "info"

    invoke-interface {v0, v1}, Lorg/w3c/dom/Document;->createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;

    move-result-object v1

    iget-object v3, p0, Lcom/daaw/hz1;->c:Lcom/daaw/tf0;

    invoke-virtual {v3}, Lcom/daaw/tf0;->b()Ljava/lang/String;

    move-result-object v3

    const-string v4, "creation_day"

    invoke-interface {v1, v4, v3}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/daaw/hz1;->c:Lcom/daaw/tf0;

    invoke-virtual {v3}, Lcom/daaw/tf0;->d()Ljava/lang/String;

    move-result-object v3

    const-string v4, "modified_day"

    invoke-interface {v1, v4, v3}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/daaw/hz1;->c:Lcom/daaw/tf0;

    invoke-virtual {v3}, Lcom/daaw/tf0;->a()Ljava/lang/String;

    move-result-object v3

    const-string v4, "author"

    invoke-interface {v1, v4, v3}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/daaw/hz1;->c:Lcom/daaw/tf0;

    invoke-virtual {v3}, Lcom/daaw/tf0;->e()Ljava/lang/String;

    move-result-object v3

    const-string v4, "player"

    invoke-interface {v1, v4, v3}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/daaw/hz1;->c:Lcom/daaw/tf0;

    invoke-virtual {v3}, Lcom/daaw/tf0;->f()Ljava/lang/String;

    move-result-object v3

    const-string v4, "player_version"

    invoke-interface {v1, v4, v3}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/daaw/hz1;->c:Lcom/daaw/tf0;

    invoke-virtual {v3}, Lcom/daaw/tf0;->c()Ljava/lang/String;

    move-result-object v3

    const-string v4, "kpl_version"

    invoke-interface {v1, v4, v3}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v1}, Lorg/w3c/dom/Element;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    new-instance v1, Ljavax/xml/transform/dom/DOMSource;

    invoke-direct {v1, v0}, Ljavax/xml/transform/dom/DOMSource;-><init>(Lorg/w3c/dom/Node;)V

    new-instance v0, Ljavax/xml/transform/stream/StreamResult;

    invoke-direct {v0, p1}, Ljavax/xml/transform/stream/StreamResult;-><init>(Ljava/io/OutputStream;)V

    invoke-static {}, Ljavax/xml/transform/TransformerFactory;->newInstance()Ljavax/xml/transform/TransformerFactory;

    move-result-object v2

    invoke-virtual {v2}, Ljavax/xml/transform/TransformerFactory;->newTransformer()Ljavax/xml/transform/Transformer;

    move-result-object v2

    const-string v3, "omit-xml-declaration"

    const-string v4, "yes"

    invoke-virtual {v2, v3, v4}, Ljavax/xml/transform/Transformer;->setOutputProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "indent"

    invoke-virtual {v2, v3, v4}, Ljavax/xml/transform/Transformer;->setOutputProperty(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p2, :cond_2

    const-string v3, "encoding"

    invoke-virtual {v2, v3, p2}, Ljavax/xml/transform/Transformer;->setOutputProperty(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    invoke-virtual {v2, v1, v0}, Ljavax/xml/transform/Transformer;->transform(Ljavax/xml/transform/Source;Ljavax/xml/transform/Result;)V

    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    return-void
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/daaw/ox;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/hz1;->b:Ljava/util/List;

    return-object v0
.end method
