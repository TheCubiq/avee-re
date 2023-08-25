.class public Lcom/daaw/dv0;
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
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/dv0;->a:Lcom/daaw/pe1;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/dv0;->b:Ljava/util/List;

    const-string v0, "HARP"

    iput-object v0, p0, Lcom/daaw/dv0;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/pe1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/dv0;->a:Lcom/daaw/pe1;

    return-object v0
.end method

.method public b(Ljava/io/OutputStream;Ljava/lang/String;)V
    .locals 4

    if-nez p2, :cond_0

    const-string p2, "UTF-16LE"

    :cond_0
    new-instance v0, Ljava/io/BufferedWriter;

    new-instance v1, Ljava/io/OutputStreamWriter;

    invoke-direct {v1, p1, p2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    const-string p1, "PLP PLAYLIST"

    invoke-virtual {v0, p1}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    const/16 p1, 0xd

    invoke-virtual {v0, p1}, Ljava/io/BufferedWriter;->write(I)V

    const/16 p2, 0xa

    invoke-virtual {v0, p2}, Ljava/io/BufferedWriter;->write(I)V

    const-string v1, "VERSION 1.20"

    invoke-virtual {v0, v1}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/io/BufferedWriter;->write(I)V

    invoke-virtual {v0, p2}, Ljava/io/BufferedWriter;->write(I)V

    invoke-virtual {v0, p1}, Ljava/io/BufferedWriter;->write(I)V

    invoke-virtual {v0, p2}, Ljava/io/BufferedWriter;->write(I)V

    iget-object v1, p0, Lcom/daaw/dv0;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Lcom/daaw/dv0;->c:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    const-string v3, ", "

    invoke-virtual {v0, v3}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/io/BufferedWriter;->write(I)V

    invoke-virtual {v0, p2}, Ljava/io/BufferedWriter;->write(I)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->flush()V

    return-void
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/dv0;->b:Ljava/util/List;

    return-object v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/dv0;->c:Ljava/lang/String;

    return-void
.end method

.method public e(Lcom/daaw/pe1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/dv0;->a:Lcom/daaw/pe1;

    return-void
.end method
