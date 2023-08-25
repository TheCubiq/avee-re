.class public final synthetic Lcom/daaw/e18;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/y08;


# instance fields
.field public final synthetic a:Lcom/daaw/k18;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/k18;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/e18;->a:Lcom/daaw/k18;

    iput-object p2, p0, Lcom/daaw/e18;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/e18;->a:Lcom/daaw/k18;

    iget-object v1, p0, Lcom/daaw/e18;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/daaw/k18;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
