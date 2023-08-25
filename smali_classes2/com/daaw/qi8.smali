.class public final Lcom/daaw/qi8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/oi8;


# static fields
.field public static final a:Lcom/daaw/j38;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/daaw/r28;

    const-string v1, "com.google.android.gms.measurement"

    invoke-static {v1}, Lcom/daaw/t18;->a(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/daaw/r28;-><init>(Landroid/net/Uri;)V

    invoke-virtual {v0}, Lcom/daaw/r28;->a()Lcom/daaw/r28;

    move-result-object v0

    const-string v1, "measurement.client.click_identifier_control.dev"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/daaw/r28;->f(Ljava/lang/String;Z)Lcom/daaw/j38;

    move-result-object v0

    sput-object v0, Lcom/daaw/qi8;->a:Lcom/daaw/j38;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()Z
    .locals 1

    sget-object v0, Lcom/daaw/qi8;->a:Lcom/daaw/j38;

    invoke-virtual {v0}, Lcom/daaw/j38;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
