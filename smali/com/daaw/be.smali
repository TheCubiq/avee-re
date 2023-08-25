.class public Lcom/daaw/be;
.super Lcom/daaw/de;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/de;-><init>()V

    return-void
.end method


# virtual methods
.method public h()V
    .locals 1

    new-instance v0, Lcom/daaw/be$a;

    invoke-direct {v0, p0}, Lcom/daaw/be$a;-><init>(Lcom/daaw/be;)V

    sput-object v0, Lcom/daaw/i61;->r:Lcom/daaw/i61$a;

    return-void
.end method
