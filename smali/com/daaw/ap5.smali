.class public final Lcom/daaw/ap5;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/bp5;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/bp5;

    invoke-direct {v0}, Lcom/daaw/bp5;-><init>()V

    sput-object v0, Lcom/daaw/ap5;->a:Lcom/daaw/bp5;

    return-void
.end method

.method public static bridge synthetic a()Lcom/daaw/bp5;
    .locals 1

    sget-object v0, Lcom/daaw/ap5;->a:Lcom/daaw/bp5;

    return-object v0
.end method
