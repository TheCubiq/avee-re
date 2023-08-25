.class public final synthetic Lcom/daaw/ii;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/gi;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/daaw/vh;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lcom/daaw/vh;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ii;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/ii;->b:Lcom/daaw/vh;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/bi;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/ii;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/daaw/ii;->b:Lcom/daaw/vh;

    invoke-static {v0, v1, p1}, Lcom/daaw/ji;->b(Ljava/lang/String;Lcom/daaw/vh;Lcom/daaw/bi;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
