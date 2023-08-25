.class public Lcom/daaw/ty;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static a:Lcom/daaw/pw1;

.field public static b:Lcom/daaw/pw1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/pw1;

    invoke-direct {v0}, Lcom/daaw/pw1;-><init>()V

    sput-object v0, Lcom/daaw/ty;->a:Lcom/daaw/pw1;

    new-instance v0, Lcom/daaw/pw1;

    invoke-direct {v0}, Lcom/daaw/pw1;-><init>()V

    sput-object v0, Lcom/daaw/ty;->b:Lcom/daaw/pw1;

    return-void
.end method
