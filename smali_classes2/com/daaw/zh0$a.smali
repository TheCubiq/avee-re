.class public Lcom/daaw/zh0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/hp;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/zh0;->i()Lcom/daaw/hp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/zh0;


# direct methods
.method public constructor <init>(Lcom/daaw/zh0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/zh0$a;->a:Lcom/daaw/zh0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/io/Writer;)V
    .locals 7

    new-instance v6, Lcom/daaw/ai0;

    iget-object v0, p0, Lcom/daaw/zh0$a;->a:Lcom/daaw/zh0;

    invoke-static {v0}, Lcom/daaw/zh0;->e(Lcom/daaw/zh0;)Ljava/util/Map;

    move-result-object v2

    iget-object v0, p0, Lcom/daaw/zh0$a;->a:Lcom/daaw/zh0;

    invoke-static {v0}, Lcom/daaw/zh0;->f(Lcom/daaw/zh0;)Ljava/util/Map;

    move-result-object v3

    iget-object v0, p0, Lcom/daaw/zh0$a;->a:Lcom/daaw/zh0;

    invoke-static {v0}, Lcom/daaw/zh0;->g(Lcom/daaw/zh0;)Lcom/daaw/lt0;

    move-result-object v4

    iget-object v0, p0, Lcom/daaw/zh0$a;->a:Lcom/daaw/zh0;

    invoke-static {v0}, Lcom/daaw/zh0;->h(Lcom/daaw/zh0;)Z

    move-result v5

    move-object v0, v6

    move-object v1, p2

    invoke-direct/range {v0 .. v5}, Lcom/daaw/ai0;-><init>(Ljava/io/Writer;Ljava/util/Map;Ljava/util/Map;Lcom/daaw/lt0;Z)V

    const/4 p2, 0x0

    invoke-virtual {v6, p1, p2}, Lcom/daaw/ai0;->i(Ljava/lang/Object;Z)Lcom/daaw/ai0;

    invoke-virtual {v6}, Lcom/daaw/ai0;->r()V

    return-void
.end method

.method public b(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    :try_start_0
    invoke-virtual {p0, p1, v0}, Lcom/daaw/zh0$a;->a(Ljava/lang/Object;Ljava/io/Writer;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
