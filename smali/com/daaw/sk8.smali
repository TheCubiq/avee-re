.class public interface abstract Lcom/daaw/sk8;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/sk8;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/ul8;

    invoke-direct {v0}, Lcom/daaw/ul8;-><init>()V

    new-instance v1, Lcom/daaw/wl8;

    invoke-direct {v1, v0}, Lcom/daaw/wl8;-><init>(Lcom/daaw/ul8;)V

    sput-object v1, Lcom/daaw/sk8;->a:Lcom/daaw/sk8;

    return-void
.end method
